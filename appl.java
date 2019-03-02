
import java.awt.*;
import java.awt.geom.Line2D;
import java.applet.*;

@SuppressWarnings("serial")
public class appl extends Applet
{
	int centerX;
	int centerY;
	int radius;
	double angle;
	Color bgr;
	Color col;
	Color fillCol;
	float line;
	private Shape pie;

	public appl()
	{
	}

	protected void update()
	{
		paint(getGraphics());
	}

	@Override
	public void init()
	{
		centerX = getWidth() / 2;
		centerY = getHeight() / 2;
		pie = new DecartsLeaf(0, 0, getWidth(), getHeight(), getWidth() / 4);
	}

	@Override
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLACK);
		g2d.draw(new Line2D.Double(0, centerY, getWidth(), centerY));
		g2d.draw(new Line2D.Double(centerX, 0, centerX, getHeight()));
		g2d.setColor(Color.RED);
		g2d.setStroke(new SloppyStroke(2));
		g2d.draw(pie);
	}

}
