class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {

            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {

                    if (row.contains(board[i][j])) {
                        return false;
                    }

                    row.add(board[i][j]);
                }

                if (board[j][i] != '.') {

                    if (col.contains(board[j][i])) {
                        return false;
                    }

                    col.add(board[j][i]);
                }
            }
        }

        for (int box = 0; box < 9; box++) {

            HashSet<Character> set = new HashSet<>();

            int sRow = (box / 3) * 3;
            int sCol = (box % 3) * 3;

            for (int i = sRow; i < sRow + 3; i++) {

                for (int j = sCol; j < sCol + 3; j++) {

                    if (board[i][j] != '.') {

                        if (set.contains(board[i][j])) {
                            return false;
                        }

                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}