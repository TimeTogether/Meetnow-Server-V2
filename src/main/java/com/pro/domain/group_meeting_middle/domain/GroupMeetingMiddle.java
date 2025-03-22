package com.pro.domain.group_meeting_middle.domain;

import com.pro.base.common.BaseEntity;
import com.pro.domain.date.domain.Date;
import com.pro.domain.group.domain.Group;
import com.pro.domain.meeting.domain.Meeting;
import com.pro.oauth2.entity.User;
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
@Table(name = "t_mn_group_meeting_middle")
public class GroupMeetingMiddle extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "group_meeting_middle_id")
  private Long id;

  @NotNull(message = "그룹은 필수값입니다.")
  private Long groupId;

  @NotNull(message = "회의는 필수값입니다.")
  private Long meetingId;

  @NotNull(message = "사용자는 필수값입니다.")
  private Long userId;

  @NotNull(message = "회의 확정 유무는 필수값입니다.")
  private boolean meetComplete;

  //Builder, of
  @Builder
  public GroupMeetingMiddle(Long id, Long groupId, Long meetingId, Long userId, boolean meetComplete) {
    this.id = id;
    this.groupId = groupId;
    this.meetingId = meetingId;
    this.userId = userId;
    this.meetComplete = meetComplete;
  }

}