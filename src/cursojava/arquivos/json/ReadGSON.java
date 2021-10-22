package cursojava.arquivos.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class ReadGSON {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader = new FileReader("users.json");
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> usuarioArray = new ArrayList<Usuario>();
		
		for (JsonElement json : jsonArray) {
			System.out.println(json);
			Usuario usuario = new Gson().fromJson(json, Usuario.class);
			usuarioArray.add(usuario);
		}
		
		System.out.println(usuarioArray);
	}

}
