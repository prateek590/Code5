
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Advanced_Tatoc {

	public static void main(String... s) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "chrome" + File.separator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc/advanced/hover/menu");

		// Part 1
		List<WebElement> ls = driver.findElements(By.className("menuitem"));
		new Actions(driver).moveToElement(driver.findElement(By.className("menutitle"))).perform();
		ls.get(3).click();

		// Part 2
		String s1 = driver.findElement(By.id("symboldisplay")).getText();
		//System.out.println(s1);
		ArrayList<String> Passkey = new ArrayList<String>();
		ArrayList<String> Name = new ArrayList<String>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://10.0.1.86:3306/tatoc", "tatocuser", "tatoc01");
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			PreparedStatement x = con.prepareStatement("SELECT * from identity where symbol='" + s1 + "'");
			ResultSet rt = x.executeQuery();
			ArrayList<String> id = new ArrayList<String>();
			while (rt.next()) {
				//System.out.println(rt.getString("id"));
				id.add(rt.getString("id"));
				//System.out.println(id);
			}
			String str = id.get(0);
			PreparedStatement w = con.prepareStatement("SELECT * from credentials where id=" + str);
			ResultSet rs = w.executeQuery();
			while (rs.next()) {
				Name.add(rs.getString("Name"));
			//	System.out.println(Name);
			}
			PreparedStatement p = con.prepareStatement("SELECT * from credentials where id=" + str);
			ResultSet rp = p.executeQuery();
			while (rp.next()) {
				Passkey.add(rp.getString("Passkey"));
			//	System.out.println(Passkey);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		WebElement nametext = driver.findElement(By.id("name"));
		WebElement passtext = driver.findElement(By.id("passkey"));
		nametext.sendKeys(Name.get(0));
		passtext.sendKeys(Passkey.get(0));
		driver.findElement(By.id("submit")).click();

		// Part 3
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("player.play()");
		try {
			Thread.sleep(28000);
		} catch (InterruptedException e3) {
			e3.printStackTrace();
		}
		driver.findElement(By.linkText("Proceed")).click();

		// Part 4
		String sessid = driver.findElement(By.id("session_id")).getText();
		sessid = sessid.substring(12, sessid.length());
		String Resturl = "http://10.0.1.86/tatoc/advanced/rest/service/token/" + sessid;

		URL url = null;
		try {
			url = new URL(Resturl);
		} catch (MalformedURLException e3) {
			e3.printStackTrace();
		}
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		try {
			conn.setRequestMethod("GET");
		} catch (ProtocolException e3) {
			e3.printStackTrace();
		}
		conn.setRequestProperty("Accept", "application/json");

		try {
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
		} catch (IOException e3) {
			e3.printStackTrace();
		}

		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} catch (IOException e5) {
			e5.printStackTrace();
		}
		String inputLine;
		StringBuffer response = new StringBuffer();

		try {
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
		} catch (IOException e5) {
			e5.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e4) {
			e4.printStackTrace();
		}
		String res = new String(response);
		JSONObject obj;
		try {
			obj = new JSONObject(res);
			res = (String) obj.get("token");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		URL url1 = null;
		try {
			url1 = new URL("http://10.0.1.86/tatoc/advanced/rest/service/register");
		} catch (MalformedURLException e3) {
			e3.printStackTrace();
		}
		HttpURLConnection conn1 = null;
		try {
			conn1 = (HttpURLConnection) url1.openConnection();
		} catch (IOException e3) {
			e3.printStackTrace();
		}

		try {
			conn1.setRequestMethod("POST");
		} catch (ProtocolException e2) {
			e2.printStackTrace();
		}
		conn1.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		String urlParameters = "id=" + sessid + "&signature=" + res + "&allow_access=1";
		conn1.setDoOutput(true);
		try {
			DataOutputStream wr = new DataOutputStream(conn1.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		conn1.disconnect();
		driver.findElement(By.cssSelector(".page a")).click();

		// Part 5
		driver.findElement(By.linkText("Download File")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		BufferedReader br = null;
		String strng = null, sCurrentLine;
		try {
			int i = 0;
			File homedir = new File(System.getProperty("user.home"));
			File fileToRead = new File(homedir, "Downloads/file_handle_test.dat");
			br = new BufferedReader(new FileReader(fileToRead));
			while ((sCurrentLine = br.readLine()) != null) {
				if (i == 2)
					strng = sCurrentLine;
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		strng = strng.substring(11, strng.length());
		driver.findElement(By.id("signature")).sendKeys(strng);
		driver.findElement(By.className("submit")).click();

		driver.close();
	}

}