{
	int i; int j; float[10][10] a; char b='c';
	i = 0;
	while ( i < 10 ) {
		j = 0;
		while ( j < 10 ) {
			a[i][j] = 0;
			j = j+1;
		}
		i = i+1;
	}
	i = 0;
	while ( i < 10 ) {
		a[i][i] = 1;
		i = i+1;
	}
}
