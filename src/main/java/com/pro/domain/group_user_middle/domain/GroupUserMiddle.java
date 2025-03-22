package com.pro.domain.group_user_middle.domain;

import com.pro.base.common.BaseEntity;
import com.pro.domain.group.domain.Group;
import com.pro.oauth2.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "t_mn_group_user_middle")
public class GroupUserMiddle extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "group_user_middle_id")
  private Long id;

  @NotNull(message = "사용자는 필수입니다.")
  private Long userId;

  @NotNull(message = "그룹은 필수입니다.")
  private Long groupId;

  //Builder, of
  @Builder
  public GroupUserMiddle(Long id, Long userId, Long groupId) {
    this.id = id;
    this.userId = userId;
    this.groupId = groupId;
  }


}