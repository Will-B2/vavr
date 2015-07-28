/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Test;

public class Function7Test {

    @Test
    public void shouldLift() {
        class Type {
            Object methodReference(Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7) {
                return null;
            }
        }
        final Type type = new Type();
        assertThat(Function7.lift(type::methodReference)).isNotNull();
    }

    @Test
    public void shouldPartiallyApplyWith1Arguments() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.apply(null)).isNotNull();
    }

    @Test
    public void shouldPartiallyApplyWith2Arguments() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.apply(null, null)).isNotNull();
    }

    @Test
    public void shouldPartiallyApplyWith3Arguments() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.apply(null, null, null)).isNotNull();
    }

    @Test
    public void shouldPartiallyApplyWith4Arguments() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.apply(null, null, null, null)).isNotNull();
    }

    @Test
    public void shouldPartiallyApplyWith5Arguments() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.apply(null, null, null, null, null)).isNotNull();
    }

    @Test
    public void shouldPartiallyApplyWith6Arguments() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.apply(null, null, null, null, null, null)).isNotNull();
    }

    @Test
      public void shouldRecognizeApplicabilityOfNull() {
          final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
          assertThat(f.isApplicableTo(null, null, null, null, null, null, null)).isTrue();
      }

      @Test
      public void shouldRecognizeApplicabilityOfNonNull() {
          final Function7<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> f = (i1, i2, i3, i4, i5, i6, i7) -> null;
          assertThat(f.isApplicableTo(1, 2, 3, 4, 5, 6, 7)).isTrue();
      }

      @Test
      public void shouldRecognizeApplicabilityToTypes() {
          final Function7<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> f = (i1, i2, i3, i4, i5, i6, i7) -> null;
          assertThat(f.isApplicableToTypes(Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class)).isTrue();
      }

    @Test
    public void shouldGetArity() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.arity()).isEqualTo(7);
    }

    @Test
    public void shouldCurry() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        final Function1<Object, Function1<Object, Function1<Object, Function1<Object, Function1<Object, Function1<Object, Function1<Object, Object>>>>>>> curried = f.curried();
        assertThat(curried).isNotNull();
    }

    @Test
    public void shouldTuple() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        final Function1<Tuple7<Object, Object, Object, Object, Object, Object, Object>, Object> tupled = f.tupled();
        assertThat(tupled).isNotNull();
    }

    @Test
    public void shouldReverse() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        assertThat(f.reversed()).isNotNull();
    }

    @Test
    public void shouldMemoize() {
        final AtomicInteger integer = new AtomicInteger();
        final Function7<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> f = (i1, i2, i3, i4, i5, i6, i7) -> i1 + i2 + i3 + i4 + i5 + i6 + i7 + integer.getAndIncrement();
        final Function7<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> memo = f.memoized();
        final int expected = memo.apply(1, 2, 3, 4, 5, 6, 7);
        assertThat(memo.apply(1, 2, 3, 4, 5, 6, 7)).isEqualTo(expected);
    }

    @Test
    public void shouldNotMemoizeAlreadyMemoizedFunction() {
        final Function7<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> f = (i1, i2, i3, i4, i5, i6, i7) -> null;
        final Function7<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> memo = f.memoized();
        assertThat(memo.memoized() == memo).isTrue();
    }

    @Test
    public void shouldComposeWithAndThen() {
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7) -> null;
        final Function1<Object, Object> after = o -> null;
        final Function7<Object, Object, Object, Object, Object, Object, Object, Object> composed = f.andThen(after);
        assertThat(composed).isNotNull();
    }

}