/*
 * package com.springboot.blog.security;
 * 
 * import java.security.Key; import java.util.Date;
 * 
 * import org.springframework.beans.factory.annotation.Value;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.security.core.Authentication; import
 * org.springframework.stereotype.Component;
 * 
 * import com.springboot.blog.exception.BlogApiException;
 * 
 * import io.jsonwebtoken.Claims; import io.jsonwebtoken.ExpiredJwtException;
 * import io.jsonwebtoken.Jwts; import io.jsonwebtoken.MalformedJwtException;
 * import io.jsonwebtoken.io.Decoders; import io.jsonwebtoken.security.Keys;
 * import io.jsonwebtoken.security.SignatureException;
 * 
 * @Component public class JwtTokenProvider {
 * 
 * @Value("${app.jwt-secret}") private String jwtSecret;
 * 
 * @Value("${app-jwt-expiration-milliseconds}") private Long jwtExpirationDate;
 * // generate jwtToken
 * 
 * public String generateToken(Authentication authentication) { String userName
 * = authentication.getName(); Date currentDate = new Date(); Date expireDate =
 * new Date(currentDate.getTime() + jwtExpirationDate); String token =
 * Jwts.builder().setSubject(userName).setIssuedAt(new
 * Date()).setExpiration(expireDate) .signWith(key()).compact(); return token; }
 * 
 * private Key key() { return
 * Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret)); }
 * 
 * // get username from jwt token public String userName(String token) { Claims
 * claims =
 * Jwts.parserBuilder().setSigningKey(key()).build().parseClaimsJwt(token).
 * getBody(); String userName = claims.getSubject(); return userName; }
 * 
 * // validate jwt token public boolean validateToken(String token) { try {
 * Jwts.parserBuilder().setSigningKey(key()).build().parse(token); return true;
 * } catch (SignatureException e) { // TODO Auto-generated catch block throw new
 * BlogApiException(HttpStatus.BAD_REQUEST, "Invalid jwt token"); } catch
 * (ExpiredJwtException e) { // TODO Auto-generated catch block throw new
 * BlogApiException(HttpStatus.BAD_REQUEST, "jwt token expired"); } catch
 * (MalformedJwtException e) { // TODO Auto-generated catch block throw new
 * BlogApiException(HttpStatus.BAD_REQUEST, "unsupported jwt token"); } catch
 * (IllegalArgumentException e) { // TODO Auto-generated catch block throw new
 * BlogApiException(HttpStatus.BAD_REQUEST, "jwt claims string is empty"); } } }
 */