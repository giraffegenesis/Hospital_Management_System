
package hospital_management_system;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Class that processes a picture based on its height and width
 * @author AbrarZawed
 * Date Created: 20th September, 2018 
 * Last Modified: 6th December, 2018
 */
public class ProfilePictureProcessing {

    /**
     * Method that resizes a pictures based on label
     * @param picPath
     * @param BLOBpic
     * @param wdth
     * @param hgt
     * @return 
     */
    public ImageIcon resizePic(String picPath, byte[] BLOBpic, int wdth, int hgt) {
        ImageIcon myImg;
        if (picPath != null) {
            myImg = new ImageIcon(picPath);
        } else {
            myImg = new ImageIcon(BLOBpic);
        }

        Image img = myImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(img);
        return myPicture;
    }

    /**
     * Method that browses an image for the local directory
     * @param lbl
     * @return 
     */
    public String browseImage(JLabel lbl) {
        String path = null;
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));

        //file extention
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");
        filec.addChoosableFileFilter(fileFilter);
        int fileState = filec.showSaveDialog(null);

        // if the user select a file 
        if (fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filec.getSelectedFile();
            path = selectedFile.getAbsolutePath();

            // display the image in the jlabel
            lbl.setIcon(resizePic(path, null, lbl.getWidth(), lbl.getHeight()));
            //jLabelPic.setIcon(new ImageIcon(path));

        } else if (fileState == JFileChooser.CANCEL_OPTION) {
            System.out.print("No Image Selected");
        }

        return path;
    }

}
