program Test7;
	read  x : int;
	print y : float;
	print z1 : float;
	print z2 : float;
	print z3 : float;
	i : int;
begin
	x := 3+4 ;
	y := x+2;
	y := 2*y;
	for (i:=x; i<20; i:=i+1) begin
		z1:= y+1;
	end;
	if x<2 then if x<1 then if x<0 then x:=3 else x:=4;
	z2:= x+3;
end.