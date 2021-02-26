package com.centroxy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ID_SEQ")
	@SequenceGenerator(allocationSize = 1, sequenceName = "USER_ID_SEQ", name = "USER_ID_SEQ")
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "ROLES")
	private String role;
	@Column(name = "IS_ACTIVE")
	private Boolean isEnable;
	/*
	 * @Column(name = "CREATED_DATE")
	 * 
	 * @CreatedDate
	 * 
	 * @Temporal(TemporalType.TIMESTAMP) private Date createdDate;
	 * 
	 * @Column(name = "UPDATED_DATE")
	 * 
	 * @UpdateTimestamp
	 * 
	 * @Temporal(TemporalType.TIMESTAMP) private Date UpdatedDate;
	 */
}
