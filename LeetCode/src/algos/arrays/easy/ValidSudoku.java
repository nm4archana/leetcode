package algos.arrays.easy;

public class ValidSudoku {
	public static boolean isValidSudoku(char[][] board) {

		int[] chk_row = new int[9];
		int[] chk_column = new int[9];

		for (int i = 0; i < board.length; i++) {
			chk_row = new int[9];
			chk_column = new int[9];

			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.') {
					int val = Character.getNumericValue(board[i][j]) - 1;
					chk_row[val] = chk_row[val] + 1;
					if (chk_row[val] > 1) {
						return false;
					}

				}

				if (board[j][i] != '.') {
					int val = Character.getNumericValue(board[j][i]) - 1;
					chk_column[val] = chk_column[val] + 1;

					if (chk_column[val] > 1) {
						return false;
					}
				}

			}
		}

		int n = 0;
		int m = 0;
		int[] chk = new int[9];

		while (n < 9) {

			while (m < 9) {

				chk = new int[9];
				for (int i = n; i < n + 3; i++) {

					for (int j = m; j < m + 3; j++) {

						// System.out.println(i+", "+j+", "+(board[i][j]));

						if (board[i][j] != '.') {

							int val = Character.getNumericValue(board[i][j]) - 1;
							chk[val] = chk[val] + 1;

							if (chk[val] > 1) {
								return false;
							}

						}

					}
				}
				m = m + 3;
			}

			n = n + 3;
			m = 0;

		}

		return true;
	}

	public static void main(String[] args) {
		char[][] arr = { { '.', '.', '.', '.', '5', '.', '.', '1', '.' },
				{ '.', '4', '.', '3', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '9', '.', '.', '.' },
				{ '8', '.', '.', '.', '.', '.', '.', '2', '.' }, { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
				{ '.', '1', '5', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
				{ '.', '2', '.', '9', '.', '.', '.', '.', '.' }, { '.', '.', '4', '.', '.', '.', '.', '.', '.' } };

		System.out.println(isValidSudoku(arr));
	}

}
