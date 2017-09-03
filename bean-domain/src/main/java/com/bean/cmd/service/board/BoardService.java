package com.bean.cmd.service.board;

import com.bean.cmd.domain.board.BoardType;
import com.bean.cmd.domain.board.BoardVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by hoon on 2016-02-22.
 */
public interface BoardService {
    Page<BoardVo> getBoards(Pageable pageable, BoardType boardType);
}
