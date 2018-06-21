import java.*;
import java.lang.*;
class Gsearch					
{

	public static void main(String[] args)
	{
 
	String address = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
	String query = "java tutorial";
	String charset = "UTF-8";
 
	URL url = new URL(address + URLEncoder.encode(query, charset));
 
	BufferedReader in = new BufferedReader(new InputStreamReader(
			url.openStream()));
	String str;
 
	while ((str = in.readLine()) != null) {
		System.out.println(str);
	}
 
	in.close();
}

}