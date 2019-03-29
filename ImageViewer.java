import java.awt.*;
import java.io.*;
import javax.swing.*;


/**
* java核心技术
*
*/

public class ImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->{
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


/**
* A fram with a label to show an image.
*/
class ImageViewerFrame extends JFrame
{
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame()
    {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        // use a label to display the images
        label = new JLabel();
        add(label);

        // set up the file JFileChooser
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // set up the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // 给menuBar上面增加 按钮选项
        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenu option = new JMenu("Option");
        menuBar.add(option);

        // 这是给 “File”按钮添加按钮项目
        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem); // menu 只是调用定义好的Item
        // option.add(openItem); 这个Item也可以被别的调用
        openItem.addActionListener(event ->{
            // show file chooser dialog
               int result = chooser.showOpenDialog(null);

               // if file selected,set it as icon of the label
               if (result == JFileChooser.APPROVE_OPTION)
               {
                   String name = chooser.getSelectedFile().getPath();
                   label.setIcon(new ImageIcon(name));
               }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event ->System.exit(0));
    }
}
