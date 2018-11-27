package com.codurance.cardinal;

import com.codurance.Rover;
import com.codurance.cardinal.Cardinal;
import com.codurance.cardinal.East;
import com.codurance.cardinal.South;
import com.codurance.cardinal.West;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SouthCardinalShould {

  @Test
  void be_facing_east_when_turned_right() {
    final Cardinal actual = new South().right();

    assertThat(actual, is(new West()));
  }

  @Test
  void be_facing_west_when_turned_left() {
    final Cardinal actual = new South().left();

    assertThat(actual, is(new East()));
  }
  @Test
  void give_cardinal_name() {
    final String actual = new South().name();

    assertThat(actual, is("S"));
  }
  @Test
  public void
  move_vertically() {
    final Rover expected = new Rover(1, 1, new South());
    final Rover actual = new South().move(1, 2);

    assertThat(actual, is(expected));
  }
}