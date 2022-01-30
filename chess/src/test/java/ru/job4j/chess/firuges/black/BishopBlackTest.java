package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenGetPositionBishopBlack() {
        Cell cell = Cell.D1;
        BishopBlack bishopBlack = new BishopBlack(cell);
        Cell bishopPos = bishopBlack.position();
        assertThat(cell, is(bishopPos));
    }

    @Test
    public void whenCopyBishopBlack() {
        Cell dest = Cell.H6;
        BishopBlack bishopBlack = new BishopBlack(Cell.F2);
        Cell bishopCopy = bishopBlack.copy(dest).position();
        assertThat(dest, is(bishopCopy));
    }

    @Test
    public void whenIsDaigonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.H1);
        boolean isDiagonal = bishopBlack.isDiagonal(bishopBlack.position(), Cell.C6);
        assertTrue(isDiagonal);
    }

    @Test
    public void whenNotDaigonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.H1);
        boolean notDiagonal = bishopBlack.isDiagonal(bishopBlack.position(), Cell.C1);
        assertFalse(notDiagonal);
    }

    @Test
    public void whenRightWayBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] actual = bishopBlack.way(Cell.G5);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWrongWayBishopBlack() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        bishopBlack.way(Cell.H1);
    }
}