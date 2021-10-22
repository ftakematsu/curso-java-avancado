package cursojava.arquivos.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WriteGSON {

	public static void main(String[] args) throws IOException {
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("12345678900");
		usuario1.setLogin("user@user.com");
		usuario1.setSenha("123456");
		usuario1.setNome("Alex Fernando");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("98765432100");
		usuario2.setLogin("user2@user.com");
		usuario2.setSenha("123456");
		usuario2.setNome("João da Silva");
		
		List<Usuario> usuarioArray = new ArrayList<>();
		usuarioArray.add(usuario1);
		usuarioArray.add(usuario2);
		
		//String json = new Gson().toJson(usuarioArray);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(usuarioArray);
		System.out.println(json);
		
		FileWriter fileWriter = new FileWriter("users.json");
		fileWriter.write(json);
		fileWriter.flush();
		fileWriter.close();
		
	}
	
}
