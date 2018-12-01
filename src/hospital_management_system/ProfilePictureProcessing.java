/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ProfilePictureProcessing {

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
