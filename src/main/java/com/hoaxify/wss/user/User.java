package com.hoaxify.wss.user;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.hoaxify.wss.shared.Views;

import lombok.Data;

@Data
@Entity
public class User implements UserDetails{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5064081692606659902L;


	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	
	@Column(name="username")
	@NotNull
	@UniqueUsername
	@JsonView(Views.Base.class)
	private String username;
	
	@NotNull
	@JsonView(Views.Base.class)
	@Column(name="displayName")
	private String displayName;
	
	@NotNull
	@JsonView(Views.Base.class)
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@NotNull
	@JsonView(Views.Base.class)
	@Column(name="educationInformation")
	private String educationInformation;
	
	@NotNull
	@JsonView(Views.Base.class)
	@Column(name="skills")
	private String skills;
	
	@NotNull
	@JsonView(Views.Base.class)
	@Column(name="workExperience")
	private String workExperience;
	
	@NotNull
	@JsonView(Views.Base.class)
	@Column(name="email")
	private String email;
	
	@NotNull
	@JsonView(Views.Sensitive.class)
	@Column(name="password")
	private String password;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("Role_user");
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	
 
	
} 

