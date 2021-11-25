package C4.C4Reto1.Repository;

import C4.C4Reto1.CrudRepository.UserCrudRepository;
import C4.C4Reto1.Model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KENDRY
 */
@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudRepository userCrudRepository;
    
    //Para traer todos los datos de la tabla
    public  List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }
    
    public  Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }
    
    public User save(User user){
        return userCrudRepository.save(user);
    }
    
    public boolean existeEmail(String email){
        Optional<User> usuario= userCrudRepository.findByEmail(email);
        return !usuario.isEmpty();
    }
    
     public Optional<User> autenticarUsuario(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
}
