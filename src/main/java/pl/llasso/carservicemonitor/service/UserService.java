package pl.llasso.carservicemonitor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.llasso.carservicemonitor.entities.User;
import pl.llasso.carservicemonitor.repository.UserRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public User findById(Long id){
        return userRepository.findById(id).get();
    }

    public List<User> findAll(){ return userRepository.findAll(); }

    public void update(User user){
        userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

//    public User registerUser(String login, String password) throws ValidationException {
//
//        User user = new User();
//        user.setLogin(login);
//        user.setPassword(passwordEncoder.encode(password));
//
//        List<String> validationFailures = validate(user);
//        if(validationFailures.isEmpty()){
//            return userRepository.save(user);
//        } else {
//            throw new ValidationException(validationFailures);
//        }
//
//    }
//
//    private List<String> validate(User user) {
//        Optional<User> byLogin = userRepository.findByLogin(user.getLogin());
//        if(byLogin.isPresent()){
//            return Arrays.asList("loginAlreadyExists");
//        }
//        return Collections.emptyList();
//    }
}
