package C4.C4Reto1.CrudRepository;

import C4.C4Reto1.Model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author KENDRY
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    //Profundizar en Query methods
    Optional<User>findByEmail(String email);
    Optional<User>findByEmailAndPassword(String email, String password);
}
