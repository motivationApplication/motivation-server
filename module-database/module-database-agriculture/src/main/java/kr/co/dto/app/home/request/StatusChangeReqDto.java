package kr.co.dto.app.home.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StatusChangeReqDto {

    @NotNull(message = "예약값은 필수입니다.")
    @Schema(description = "예약ID", example = "5fc775a4-265c-11ef-81e3-02001701d75b")
    private String reservationId;

    @NotNull(message = "상태변경값은 필수입니다.")
    @Schema(description = "상태값", example = "01")
    private String reservationStatus;

}
