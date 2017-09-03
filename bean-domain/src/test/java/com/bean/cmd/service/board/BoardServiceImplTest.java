package com.bean.cmd.service.board;

import com.bean.cmd.domain.board.Board;
import com.bean.cmd.domain.board.BoardRepository;
import com.bean.cmd.domain.board.BoardType;
import com.bean.cmd.domain.board.BoardVo;
import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.domain.*;

import java.util.ArrayList;

import static org.mockito.Mockito.doReturn;

/**
 * Created by hoon on 2016-06-06.
 */
@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class BoardServiceImplTest {
    @InjectMocks
    private BoardService boardService = new BoardServiceImpl();

    @Mock
    private BoardRepository boardRepository;

    @Test
    public void test() {
        //given
        Page<Board> page1 = new PageImpl<Board>(new ArrayList<Board>());
        Pageable pageable = createPageRequest(1, 10);
        BoardType boardType = BoardType.BBS_NORMAL;
        doReturn(page1).when(boardRepository).findByBoardType(boardType, pageable);

        //when
        Page<BoardVo> page = boardService.getBoards(pageable, boardType);

        //then
        Assert.assertNotNull(page);
    }

    private Pageable createPageRequest(int page, int size) {
        //return new PageRequest(page, size);
        return new PageRequest(page - 1, size, Sort.Direction.DESC, "createdAt");
    }

}
