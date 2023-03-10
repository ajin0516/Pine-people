package com.lion.pinepeople.domain.dto.participant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lion.pinepeople.domain.entity.Participant;
import com.lion.pinepeople.enums.ApprovalStatus;
import com.lion.pinepeople.enums.ParticipantRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ParticipantInfoResponse {
    private Long id;
    private ApprovalStatus approvalStatus;
    private ParticipantRole participantRole;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd- hh:mm:ss", timezone = "Asia/Seoul")
    private Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd- hh:mm:ss", timezone = "Asia/Seoul")
    private Timestamp updatedAt;
    private Long userId;
    private String userName;
    private String userProfileImg;
    private Long partyId;
    public static ParticipantInfoResponse of(Participant participant){
        return ParticipantInfoResponse.builder()
                .id(participant.getId())
                .approvalStatus(participant.getApprovalStatus())
                .participantRole(participant.getParticipantRole())
                .createdAt(participant.getCreatedAt())
                .updatedAt(participant.getUpdatedAt())
                .partyId(participant.getParty().getId())
                .userId(participant.getUser().getId())
                .userName(participant.getUser().getName())
                .userProfileImg(participant.getUser().getProfileImg())
                .build();
    }

    //파티원 정보 수정시 createdAt이 null로 리턴되는 현상 해결을 위한 메소드
    public static ParticipantInfoResponse of(Participant participant, Timestamp createdAt){
        return ParticipantInfoResponse.builder()
                .id(participant.getId())
                .approvalStatus(participant.getApprovalStatus())
                .participantRole(participant.getParticipantRole())
                .createdAt(createdAt)
                .updatedAt(participant.getUpdatedAt())
                .partyId(participant.getParty().getId())
                .userId(participant.getUser().getId())
                .build();
    }

}
