/*
 * package com.springboot.blog.service.serviceImpl;
 * 
 * import java.util.HashSet; import java.util.Set;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken; import
 * org.springframework.security.core.Authentication; import
 * org.springframework.security.core.context.SecurityContextHolder; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.stereotype.Service;
 * 
 * import com.springboot.blog.DTO.LoginDto; import
 * com.springboot.blog.DTO.RegisterDto; import com.springboot.blog.entity.Role;
 * import com.springboot.blog.entity.User; import
 * com.springboot.blog.exception.BlogApiException; import
 * com.springboot.blog.repository.RolesRepository; import
 * com.springboot.blog.repository.UserRepository; import
 * com.springboot.blog.security.JwtTokenProvider; import
 * com.springboot.blog.service.AuthService;
 * 
 * @Service public class AuthServiceImpl implements AuthService { private
 * AuthenticationManager authenciManager; private UserRepository userRepository;
 * private PasswordEncoder passwordEncoder; private RolesRepository
 * roleRepository; private JwtTokenProvider jwtTokenProvider;
 * 
 * @Autowired public AuthServiceImpl(AuthenticationManager
 * authenciManager,UserRepository userRepository, PasswordEncoder
 * passwordEncoder,RolesRepository roleRepository,JwtTokenProvider
 * jwtTokenProvider) { this.authenciManager = authenciManager;
 * this.userRepository =userRepository; this.passwordEncoder= passwordEncoder;
 * this.roleRepository= roleRepository; this.jwtTokenProvider= jwtTokenProvider;
 * }
 * 
 * @Override public String login(LoginDto loginDto) {
 * 
 * Authentication authenticate = authenciManager.authenticate( new
 * UsernamePasswordAuthenticationToken(loginDto.getUsernameOrEmail(),
 * loginDto.getPassword()));
 * SecurityContextHolder.getContext().setAuthentication(authenticate); String
 * token = jwtTokenProvider.generateToken(authenticate); return token; }
 * 
 * @Override public String register(RegisterDto registerDto) { //add userName
 * exists in database
 * if(userRepository.existsByUsername(registerDto.getUsername())) { throw new
 * BlogApiException(HttpStatus.BAD_REQUEST, "Username already exists"); } //add
 * check for email if(userRepository.existsByEmail(registerDto.getEmail())) {
 * throw new BlogApiException(HttpStatus.BAD_REQUEST, "Email already exists"); }
 * User user= new User(); user.setName(registerDto.getName());
 * user.setPassword(passwordEncoder.encode (registerDto.getPassword()));
 * user.setEmail(registerDto.getEmail());
 * user.setUsername(registerDto.getUsername()); Set<Role>roles= new HashSet<>();
 * Role userRole= roleRepository.findByName("ROLE_USER").get();
 * roles.add(userRole); user.setRoles(roles); userRepository.save(user); return
 * "user registered successufully"; }
 * 
 * }
 */