package br.ifms.edu.frame1.repositories;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifms.edu.frame1.model.User;


@Repository
   
    public interface UserRepository extends JpaRepository<User, UUID>{

    }



    //private static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    //SELECT * FROM TB_USER
    //public List<User> findAll(){
    //    final Logger logger = LoggerFactory.getLogger(UserRepository.class);
    //    List<User> users = new ArrayList<User>();
    //    users.add(new User(UUID.randomUUID(),"Flavio", "flavio@flavio"));
    //    users.add(new User(UUID.randomUUID(),"Faby", "faby@flavio"));
    //    users.add(new User(UUID.randomUUID(),"Ryan", "ryan@flavio"));
    //    users.add(new User(UUID.randomUUID(),"Snoopy", "snoopy@flavio"));
    ///    logger.info("Listando os usuarios...");
    //    
    //    return users;
    //}
    

