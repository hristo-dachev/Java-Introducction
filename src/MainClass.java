import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<String> currentlyLoggedUsers = new LinkedList<String>();
		Map<String, Integer> usersToLoginCount = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		String FullCommand;
		String[] split;
		String username;
		String command;
		while(true){
			System.out.printf("Въведи команда: ");
	
			
			FullCommand = input.next();
	
			split = FullCommand.split(":");
			username = split[0];
			command = split[1];
			//System.out.printf("username: %s\n", username);
			//System.out.printf("command: %s\n", command);
	
			switch (command) {
			case "login":
				if (currentlyLoggedUsers.contains(username) == false) {
					currentlyLoggedUsers.add(username);
					System.out.println("ok");
				}else{
					System.out.println("ok");
				}
				if (usersToLoginCount.containsKey(username) == true) {
					usersToLoginCount.put(username, usersToLoginCount.get(username) + 1);
					System.out.println("ok");
				} else {
					usersToLoginCount.put(username, 1);
				}
	
				break;
	
			case "logout":
				if (currentlyLoggedUsers.contains(username) == true){
					usersToLoginCount.remove(username);
					System.out.println("ok");
				}else{
					System.out.println("error:notlogged");
				}
				break;
	
			case "shutdown":
				System.exit(0);
				break;
			default:
				System.out.println("error:unknowncommand");
				break;
			}	
		}

	}

}
