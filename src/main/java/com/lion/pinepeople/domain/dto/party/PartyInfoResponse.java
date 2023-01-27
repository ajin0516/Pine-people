package com.lion.pinepeople.domain.dto.party;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lion.pinepeople.domain.entity.Participant;
import com.lion.pinepeople.domain.entity.Party;
import lombok.*;
import org.springframework.data.domain.Page;

import java.sql.Date;
import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class PartyInfoResponse {
    private Long id;
    private String partyTitle;
    private String partyContent;
    private Integer partySize;
    private Integer partyCost;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date endDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd- hh:mm:ss", timezone = "Asia/Seoul")
    private Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd- hh:mm:ss", timezone = "Asia/Seoul")
    private Timestamp updatedAt;
    private String address;
    private String announcement;
    private String categoryName;
    private String hostName;

    //파티 생성, 조회에 쓰이는 메소드
    public static PartyInfoResponse of(Party party){
        return PartyInfoResponse.builder()
                .id(party.getId())
                .partyContent(party.getPartyContent())
                .address(party.getAddress())
                .partySize(party.getPartySize())
                .partyCost(party.getPartyCost())
                .partyTitle(party.getPartyTitle())
                .announcement(party.getAnnouncement())
                .hostName(party.getUser().getName())
                .createdAt(party.getCreatedAt())
                .updatedAt(party.getUpdatedAt())
                .startDate(party.getStartDate())
                .endDate(party.getEndDate())
                .categoryName(party.getCategory().getName())
                .build();
    }

    //파티 수정시 createdAt이 null로 리턴되는 현상 해결을 위한 메소드
    public static PartyInfoResponse of(Party party, Timestamp createdAt){
        return PartyInfoResponse.builder()
                .id(party.getId())
                .partyContent(party.getPartyContent())
                .address(party.getAddress())
                .partySize(party.getPartySize())
                .partyCost(party.getPartyCost())
                .partyTitle(party.getPartyTitle())
                .announcement(party.getAnnouncement())
                .createdAt(createdAt)
                .hostName(party.getUser().getName())
                .updatedAt(party.getUpdatedAt())
                .startDate(party.getStartDate())
                .endDate(party.getEndDate())
                .build();
    }

    //파티 참여자 테이블을 조회한 결과를 통해 속한 파티의 정보를 리턴
    public static PartyInfoResponse of(Participant participant){
        Party party = participant.getParty();
        return PartyInfoResponse.builder()
                .id(party.getId())
                .partyContent(party.getPartyContent())
                .address(party.getAddress())
                .partySize(party.getPartySize())
                .partyCost(party.getPartyCost())
                .partyTitle(party.getPartyTitle())
                .announcement(party.getAnnouncement())
                .hostName(party.getUser().getName())
                .createdAt(party.getCreatedAt())
                .updatedAt(party.getUpdatedAt())
                .startDate(party.getStartDate())
                .endDate(party.getEndDate())
                .build();
    }

    /* Page<Entity> -> Page<Dto> 변환처리 */
    public static Page<PartyInfoResponse> toPage(Page<Party> post){

        Page<PartyInfoResponse> pageResponse = post.map(m -> PartyInfoResponse.builder()
                .id(m.getId())
                .categoryName(m.getCategory().getName())
                .partyTitle(m.getPartyTitle())
                .partyContent(m.getPartyContent())
                .partySize(m.getPartySize())
                .partyCost(m.getPartyCost())
                .announcement(m.getAnnouncement())
                .createdAt(m.getCreatedAt())
                .updatedAt(m.getUpdatedAt())
                .startDate(m.getStartDate())
                .endDate(m.getEndDate())
                .build());

        return pageResponse;
    }
}
