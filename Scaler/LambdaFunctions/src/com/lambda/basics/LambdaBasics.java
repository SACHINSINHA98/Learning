package com.lambda.basics;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaBasics {
public static void main(String[] args) {
	Consumer<String>con= str->System.out.println(str);
	con.accept("SACHIN");
	Predicate<Integer>pd=i->i>10;
	System.out.println(pd.test(11));
	Supplier<Date>sp=()->new Date();
	System.out.println(sp.get());
	Function<Integer,Integer>func=(i)->i*2;
	System.out.println(func.apply(2));
}
}
