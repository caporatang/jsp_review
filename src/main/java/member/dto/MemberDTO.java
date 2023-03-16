package member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName : member.dto
 * fileName : MemberDTO
 * author : taeil
 * date : 2023/03/16
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2023/03/16        taeil                   최초생성
 */
@Getter
@Setter
@ToString
public class MemberDTO {
    private String id;
    private String pwd;
    private String email;
    private String phoneNum;
}