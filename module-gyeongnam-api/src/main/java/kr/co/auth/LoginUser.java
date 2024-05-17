package kr.co.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import kr.co.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Data
public class LoginUser implements Serializable {

    private Collection<? extends GrantedAuthority> authorities;
    private User user;


    public LoginUser(User user){
       this.user = user;
       this.authorities = new ArrayList<>(){{
           add(new SimpleGrantedAuthority("user"));
       }};
    }
}
