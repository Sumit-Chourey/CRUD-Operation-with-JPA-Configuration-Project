package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.entities.User;

@SpringBootApplication
public class JpaConfigProjectApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(JpaConfigProjectApplication.class, args);
		
		UserRepo userRepo = context.getBean(UserRepo.class);
		//(1)
		//Create object of user
		/*User user1= new User();
		user1.setName("Sumit chourey");
		user1.setCity("Mumbai");
		user1.setStatus("I am Devops engineer");
		
		User user2= new User();
		user2.setName("Mraduk");
		user2.setCity("Bombay");
		user2.setStatus("I am  java engineer");
		
		//for saving one user only
		//User us1= userRepo.save(user);
		//For save multiple user 
		List<User> users=List.of(user1,user2);
		userRepo.saveAll(users);
		
		//System.out.println("this is Devops person : "+us1);
		*/
		//(2)
		//update table 
//		Optional<User> optional = userRepo.findById(3); 
//		
//		User user = optional.get();
//		//System.out.println(user);
//		user.setName("Mradul jain");
//		User result =userRepo.save(user);
//		System.out.println(result);
//		
		//(3)
		//GET (Show) data table
		//findById(id) -return optional Containing your data
//		Iterable<User> itr= userRepo.findAll();
//		Iterator<User> iterator =itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user= iterator.next();
//			System.out.println(user);
//		}
		//using lambda function
	//	itr.forEach(user->{System.out.println(user);});
		
		//(4)
		//Delete 
		//Single delete
		userRepo.deleteById(2);
		System.out.println("Deleted");
		//for delete multiple user
		Iterable<User> allusers= userRepo.findAll();
		allusers.forEach(user->System.out.println(user));
		
		userRepo.deleteAll(allusers);
		
	}

}
