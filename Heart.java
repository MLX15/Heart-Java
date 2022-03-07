import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Start {
    static GraphicsDevice gd GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    static int width = gd.getDisplayMode().getwidth();
    static int height gd.getDisplayMlode()-getHeight() - 100;
	
    static ArrayList<IconDeskTop> iconList - new ArrayList<IconDeskTop>();
    static int iconCount = Desktopwindows.getDesktopIconsCount();
	
    public static void addIconList(){
        for(int i-0 ; ik iconCount; i++ ){
            iconList.add(new IconDeskTop(i));
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
	addIconList ();
    AnimationStart.cain()
	
	
	}
}