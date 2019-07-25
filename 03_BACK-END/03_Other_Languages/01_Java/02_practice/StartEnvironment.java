import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

// Script to automatically start all programs and setup the environment for the FullStack in Java journey

/*
 * Start Notepad ++;
 * Open Google Chrome (With specific tab);
 * Open GitHub for Desktop;
 * Open Eclipse;
 * Open FullStack directory;
 * Start MySQL80 service (Start Database);
 * Open MySQL Workbench;
*/
 
public class StartEnvironment {
	
	// Launch Notepad++:
		public static void startNotepadpp() {
			try {
				System.out.println("Starting Notepad++...");
				Process p = Runtime.getRuntime().exec("C:\\Users\\gemdi\\Desktop\\Guilherme\\Programacao\\Notepad++\\notepad++.exe");
			    System.out.println("Notepad++ launched!");
			} catch (Exception e) {
			    e.printStackTrace();
			}
		}
		
	// Launch Google Chrome:
	public static void startChrome() {
		try {
			System.out.println("Starting Google Chrome...");
		    URI myURI = new java.net.URI("https://github.com/guidias1212/road_to_fullstack");
		    java.awt.Desktop.getDesktop().browse(myURI);
		    System.out.println("Google Chrome launched!");
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	
	// Launch GitHub for Desktop:
	public static void startGitHub() {
		
		try {
			System.out.println("Starting GitHub...");
		    Process p = Runtime.getRuntime().exec("C:\\Users\\gemdi\\AppData\\Local\\GitHubDesktop\\GitHubDesktop.exe");
		    p.waitFor();
		    System.out.println("GitHub launched!");
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
	
	// Launch Eclipse:
	public static void startEclipse() {
		try {
			System.out.println("Starting Eclipse...");
		    Process p = Runtime.getRuntime().exec("C:\\Users\\gemdi\\Desktop\\Guilherme\\Programacao\\Java\\Eclipse\\eclipse-java-2019-06-R-win32-x86_64\\eclipse\\eclipse.exe");
		    System.out.println("Eclipse launched!");
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}
	
	// Open FullStack directory:
	public static void openFullStackDir() {
		
		try {
			System.out.println("Opening road_to_fullstack directory...");
			Desktop.getDesktop().open(new File("C:\\Users\\gemdi\\Desktop\\Guilherme\\Programacao\\FullStack\\road_to_fullstack"));
		    System.out.println("road_to_fullstack directory opened!");
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}
	
	// Start MySQL80 Service:
	public static void startMySQL80service() {
		
		Process p;
        try {
            p = Runtime.getRuntime().exec("cmd /c sc start MySQL80");
          //String[] launch = {"cmd /c sc start MySQL80"};
    
            p.waitFor(); 
            BufferedReader reader=new BufferedReader(new InputStreamReader(
             p.getInputStream())); 
            String line; 
            while((line = reader.readLine()) != null) { 
                System.out.println(line);
            } 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	}

	// Open MySQL Workbench:
	public static void startMySQLWorkbench() {
		try {
			System.out.println("Starting MySQL Workbench...");
		    Process p = Runtime.getRuntime().exec("C:\\Program Files\\MySQL\\MySQL Workbench 8.0 CE\\MySQLWorkbench.exe");
		    System.out.println("MySQL Workbench launched!");
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}
		
	
	public static void main(String[] args) {
		
		startNotepadpp();
		startChrome();
		startGitHub();
		startEclipse();
		openFullStackDir();
		startMySQL80service();
		startMySQLWorkbench();
		
	}

}
