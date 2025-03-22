package com.pro.domain.place.domain;

import com.pro.base.common.BaseEntity;
import com.pro.domain.meeting.domain.Meeting;
import com.pro.domain.vote.domain.Vote;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "t_mn_place")
public class Place{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "place_id")
  private Long id;

  @NotNull(message = "회의 아이디 값은 필수값입니다.")
  private Long meetingId;

  @NotNull(message = "장소 이름은 필수값입니다.")
  @Column(length = 150)
  private String placeName;

  @Nullable
  private String placeUrl;

  @NotNull(message = "장소 확정 유무는 필수값입니다.")
  private boolean placeComplete;

  //Builder, of
  @Builder
  public Place(Long id, Long meetingId, String placeName, @Nullable String placeUrl, boolean placeComplete) {
    this.id = id;
    this.meetingId = meetingId;
    this.placeName = placeName;
    this.placeUrl = placeUrl;
    this.placeComplete = placeComplete;
  }

}
