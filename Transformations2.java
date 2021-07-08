
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;



import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JFrame;  
import javax.swing.JPanel;  

public class Transformations2 extends Frame implements ActionListener {
	


// Initialize coordinates of the rectangle 
	int[] x = {400,600,600,400};
	int[] y = {400,400,200,200};




public static void main(String[] args) {
	

	  Transformations2 t=new Transformations2();
	  t.setSize(800, 800);
	  t.setTitle("Transformation");
	  t.setBackground(Color.getHSBColor(0.55f, 0.2f, 0.9f));
	  t.setVisible(true);
	 
	  
	  
	  
// Set Frame size to 800x800)
// Set background color
// Set visibility

}
public Transformations2() {
	TransDesign design=new TransDesign();
	
	MenuBar bar=new MenuBar();
    Menu menu=new Menu("Initial point");
    MenuItem item1=new MenuItem("DEfault");
    menu.add(item1);
    bar.add(menu);
    setMenuBar(bar);
    item1.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent event) {
  		  System.out.println(">>>>>>>>");
          design.initialPosition();
 	   }
});
    
    Panel p1=new Panel();
    p1.setLayout(new GridBagLayout());        
       
    p1.setLayout(new java.awt.GridBagLayout());
    
    
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
  
    
   
   
    
    Button StretchinX =new Button("Stretch in X");
    gridBagConstraints = new GridBagConstraints();
    p1.add(StretchinX, gridBagConstraints);
    
    Button StretchinY =new Button("Stretch in Y");
    gridBagConstraints = new GridBagConstraints();
    p1.add(StretchinY, gridBagConstraints);
    
    Button ScaleUp =new Button("Scale Up");
    gridBagConstraints = new GridBagConstraints();
    p1.add(ScaleUp, gridBagConstraints);
    
    Button ScaleDown =new Button("Scale Down");
    gridBagConstraints = new GridBagConstraints();
    p1.add(ScaleDown, gridBagConstraints);
    
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {System.exit(0);}
    });


    
    add(p1,BorderLayout.PAGE_START);
    
    ScaleUp.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent event) {
  		   design.Scale_up();
  	   }
  });
    

    ScaleDown.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent event) {
  		   design.Scale_down();
  	   }
  });
    StretchinX.addActionListener(new ActionListener(){
 	   public void actionPerformed(ActionEvent event) {
 		  design.Stretch_X();
 	   }
 });
    StretchinY.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent event) {
  		   design.Stretch_Y();
  	   }
  });
   
    
    
    this.add(design,BorderLayout.CENTER);
     

    
    

}
public void paintComponent(Graphics2D g)
{
	super.paint(g);  
	  Graphics2D g2d = (Graphics2D) g;  
    
     int width= this.getWidth();
	  int height=this.getHeight();
	
	 
     
} 
// Draw 2 lines and paint 1 filledtriangle

public void paint(Graphics g) {
	
    g.drawLine(800, 400, 0, 400);
    g.drawLine(400, 800, 400, 0);
    
    g.fillRect(400, 300, 100, 100);
    
    
   
	
}



public void windowClosing(WindowEvent arg0) {
    int res=JOptionPane.showConfirmDialog(this, "Are You Sure", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
if(res==JOptionPane.YES_OPTION){
    System.exit(0);
}     
}






class TransDesign extends JPanel {
    private int Xcord = 0;
    private int Ycord =0;
    private int width =0;
    private int height =0;
    private Dimension size = new Dimension(800,800);

     public void initialPosition(){
         Xcord=0;
         Ycord=0;
         width =0;
         height =0;
         
         repaint();
     }

    
    
    public void Stretch_X() {
        width+=50;
        repaint();
    }

    public void Stretch_Y() {
        height+=50;
        repaint();
    }
    
    public void Scale_up() {
    	width+=50;
    	height+=50;
        repaint();
    }
    public void Scale_down() {
    	width-=50;
    	height-=50;
        repaint();
    }
    
    /** Suggest a size to the layout manager. */
    @Override
    public Dimension getPreferredSize() {
        return size;
    }
    
    protected void paintComponent(Graphics aRectangle) {
        super.paintComponent(aRectangle);
        // This will center the ball if it is the first time painted
        // OR if the x or y co-ord goes off the left/top edge.
        // Further logic left to user..
        if (Xcord<0 || Ycord<0) {
            Xcord = getWidth()/2;
            Ycord = getHeight()/2;
        }
       
        aRectangle.drawLine(800, 400, 0, 400);
        aRectangle.drawLine(400, 800, 400, 0);
        aRectangle.fillRect(400+Xcord, 300+Ycord, 100+width, 100+height);
        
    
         
    }







}






@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}




}






