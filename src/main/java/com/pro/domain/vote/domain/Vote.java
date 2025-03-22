package com.pro.domain.vote.domain;

import com.pro.base.common.BaseEntity;
import com.pro.domain.meeting.domain.Meeting;
import com.pro.domain.place.domain.Place;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "t_mn_vote")
public class Vote extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "vote_id")
  private Long id;

  @NotNull(message = "장소 아이디 값은 필수값입니다.")
  private Long placeId;

  @NotNull(message = "투표한 사용자 아이디 값은 필수입니다.")
  private Long userId;

  //Builder, of
  @Builder
  public Vote(Long id, Long placeId, Long userId) {
    this.id = id;
    this.placeId = placeId;
    this.userId = userId;
  }

}