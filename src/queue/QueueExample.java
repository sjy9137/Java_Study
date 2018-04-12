package queue;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<>();
		queue.offer(new Message("sendMail", "hong"));
		queue.offer(new Message("sendSMS", "yeo"));
		queue.offer(new Message("sendKakaotalk", "mina"));

/*		Message message = queue.poll();
		System.out.println(message.command  + "  " + message.to);
	
		message = queue.peek();
		System.out.println(message.command  + "  " + message.to);
		
		message = queue.peek();
		System.out.println(message.command  + "  " + message.to);
		*/
		
	//printQ(queue);
		
		while(!queue.isEmpty()) {
			Message message = queue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to +"에게 "+ message.command + "를 실시합니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to +"에게 "+ message.command + "를 실시합니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.to +"에게 "+ message.command + "를 실시합니다.");
				break;
			
			}
		}
		
		
	}

	private static void printQ(Queue<Message> queue) {
		Iterator iter = queue.iterator();
		
		while(iter.hasNext()) {
			Message message1= (Message) iter.next();
			System.out.println(message1.command  + "  " + message1.to);
			
		}
	}

}
