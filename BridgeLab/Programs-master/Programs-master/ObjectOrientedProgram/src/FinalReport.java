import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class FinalReport {
	
static public void result(JSONArray arr) throws Exception {
	try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/finalreport.json")){
		file.write(arr.toJSONString());
		file.flush();
		System.out.println("successfully upagraded");
	}
	
}
static public void stockdetail(JSONArray arr) throws IOException {
	try(FileWriter file=new FileWriter("/home/bridgeit/Desktop/2d/stockdetails.json")){
		file.write(arr.toJSONString());
		file.flush();
		System.out.println("successfully upagraded");
}

}}