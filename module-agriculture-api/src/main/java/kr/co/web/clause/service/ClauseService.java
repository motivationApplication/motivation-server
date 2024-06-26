package kr.co.web.clause.service;

import kr.co.dto.web.clause.response.ClauseListResDto;
import kr.co.dto.web.clause.response.PrivacyClauseResDto;

public interface ClauseService {
    PrivacyClauseResDto privacy();
    ClauseListResDto clauseList();
}
