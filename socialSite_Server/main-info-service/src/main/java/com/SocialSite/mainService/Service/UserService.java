//package com.SocialSite.mainService.Service;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//@Slf4j
//public class UserService implements UserServiceInterface, UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
////    @Autowired
////    private RoleRepository roleRepository;
//
//    public User saveUser(User userSignupDTO) {
//        log.info("Saving a new user {} inside of the database", userSignupDTO.getUserName());
//        User user = new User(userSignupDTO.getUserName(), userSignupDTO.getEmail(), userSignupDTO.getPassword());
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }
//
//    public List<User> getUsers() {
//        log.info("Fetching all users");
//        return userRepository.findAll();
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userRepository.findByEmail(email);
//        if (user == null) {
//            log.error("User not found in the database");
//            throw new UsernameNotFoundException("User not found in the database");
//        } else {
//            log.info("User is found in the database: {}", email);
//            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
////            user.getRoles().forEach(role -> {
////                authorities.add(new SimpleGrantedAuthority(role.getName()));
////            });
//            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
//        }
//    }
//}
