/*
 * package com.springboot.blog.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.config.Customizer; import
 * org.springframework.security.config.annotation.authentication.configuration.
 * AuthenticationConfiguration; import
 * org.springframework.security.config.annotation.method.configuration.
 * EnableMethodSecurity; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.http.SessionCreationPolicy; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager; import
 * org.springframework.security.web.SecurityFilterChain; import
 * org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter;
 * 
 * import com.springboot.blog.security.JwtAuthenticationEntryPoint; import
 * com.springboot.blog.security.JwtAuthenticationFilter;
 * 
 * @EnableMethodSecurity
 * 
 * @Configuration public class SecurityConfig {
 * 
 * private UserDetailsService userDetailsService; private
 * JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint; private
 * JwtAuthenticationFilter jwtAuthenticationFilter;
 * 
 * @Autowired public SecurityConfig(UserDetailsService userDetailsService,
 * JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint,
 * JwtAuthenticationFilter jwtAuthenticationFilter) { this.userDetailsService =
 * userDetailsService; this.jwtAuthenticationEntryPoint =
 * jwtAuthenticationEntryPoint; this.jwtAuthenticationFilter =
 * jwtAuthenticationFilter; }
 * 
 * @Bean public AuthenticationManager
 * authenticationManager(AuthenticationConfiguration configuration) throws
 * Exception { return configuration.getAuthenticationManager();
 * 
 * }
 * 
 * @Bean public static BCryptPasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Bean SecurityFilterChain securityFilterChain(HttpSecurity http) throws
 * Exception { http.csrf().disable(); // can be done with this way also //
 * http.authorizeHttpRequests().anyRequest().authenticated();
 * 
 * http.authorizeHttpRequests((authorize) -> //
 * authorize.anyRequest().authenticated()
 * 
 * authorize.requestMatchers(HttpMethod.GET,
 * "/api/**").permitAll().anyRequest().authenticated())
 * .httpBasic(Customizer.withDefaults());
 * 
 * 
 * authorize.requestMatchers(HttpMethod.GET,
 * "/api/**").permitAll().requestMatchers("/api/auth/**").permitAll()
 * .anyRequest().authenticated()); .exceptionHandling(exception ->
 * exception.authenticationEntryPoint(jwtAuthenticationEntryPoint))
 * .sessionManagement(session ->
 * session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
 * http.addFilterBefore(jwtAuthenticationFilter,
 * UsernamePasswordAuthenticationFilter.class return http.build(); }
 * 
 * 
 * FOR IN MEMORY AUTHENTICATION
 * 
 * @Bean public UserDetailsService userDetailsService() { UserDetails sachin =
 * User.builder().username("sachin").password(passwordEncoder().encode("sachin")
 * ) .roles("USER").build(); UserDetails admin =
 * User.builder().username("admin").password(passwordEncoder().encode("admin"))
 * .roles("ADMIN").build(); return new InMemoryUserDetailsManager(sachin,
 * admin); }
 * 
 * }
 */