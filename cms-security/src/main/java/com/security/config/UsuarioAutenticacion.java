/*
 * package com.security.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.User.UserBuilder; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class UsuarioAutenticacion {
 * 
 * @Bean public UserDetailsService usuarios() { UserBuilder userBuilder =
 * User.withDefaultPasswordEncoder(); UserDetails usuario1 =
 * userBuilder.username("admin").password("admin").roles("ADMIN").build();
 * 
 * UserDetails usuario2 =
 * userBuilder.username("usuario").password("1234").roles("USER").build();
 * return new InMemoryUserDetailsManager(usuario1,usuario2);
 * 
 * } }
 */