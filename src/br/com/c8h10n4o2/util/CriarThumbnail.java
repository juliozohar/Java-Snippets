package br.com.c8h10n4o2.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.ImageIcon;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * Cria thumbnail de uma imagem, limitando o tamanho maximo da imagem 
 * aa proporcao dada em relacao aa dimensao maxima (dimMax)
 * @author Julio Cesar Torres - juliozohar 
 */
public class CriarThumbnail {
	
	/**
	 * Cria o thumbnail de uma imagem, limitando o tamanho maximo da imagem 
	 * aa proporcao dada em relacao aa variavel dimMax. 
	 * @param pathOrigem Path do arquivo de imagem origem
	 * @param pathThumb Path para armazanamento do thumbnail criado
	 * @param dimMax Razao maxima do thumbnail em relacao aa imagem origem
	 */
	public static void criaThumbnail(String pathOrigem, String pathThumb, int dimMax) {
		try {

			Image inImage = new ImageIcon(pathOrigem).getImage();
			double scale = (double)dimMax/(double)inImage.getWidth(null);

			int scaledW = (int)(scale*inImage.getWidth(null));
			int scaledH = (int)(scale*inImage.getHeight(null));
			BufferedImage outImage = new BufferedImage(scaledW, scaledH, BufferedImage.TYPE_INT_RGB);
			AffineTransform tx = new AffineTransform();

			if (scale < 1.0d) {
				tx.scale(scale, scale);
			}

			Graphics2D g2d = outImage.createGraphics();
			g2d.drawImage(inImage, tx, null);
			g2d.dispose();

			OutputStream os = new FileOutputStream(pathThumb);
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
			encoder.encode(outImage);
			os.close();
		} catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
			e.printStackTrace();
		}
	}
}