# Java & Twitter

Intro side project for Java and Maven.  This is one of my first experiences with the 2 technologies, I do not endorse any aspects of the project as best practices.

## Overview

Project uses `twitter4j` to fetch tweets from a specified twitter user's timeline and prints tweet text.

## Usage

Assumes Java & Maven are installed.

#### Clone repo

```bash
$ git clone https://github.com/AdamSpannbauer/javaTwitter.git
```

#### Compile/install project

```bash
$ cd javaTwitter
$ mvn compile
$ mvn install
```

#### View a twitter user's timeline

*Note: commands below can be run without `-q`; this flag removes additional Maven output.*

* Example for pulling tweets by `@stnklean` (output truncated)

```
$ mvn exec:java -Dexec.args="stnklean" -q
@stnklean - RT @SpongeBLaugh: POOP: People Order Our Patties RT if you remember this one. ;)
@stnklean - RT @augst: only wearing clothes made by friends or underground brands im supporting in 2019
@stnklean - RT @Dastonio: https://t.co/Hd80N1ykaQ
@stnklean - RT @stnklean: https://t.co/NYsGGyUfhR
@stnklean - RT @ilovesmokingmid: “soulja boy just dropshipping items he got from china for 2x the price” https://t.co/62pZnSUHbm
@stnklean - @alilpancho SO FIRE!!!
```

* If no user is specifed the project defaults to pulling `@madflavor`'s tweets (output truncated)

```
$ mvn exec:java -q
No user provided; defaulting to @madflavor.
@madflavor - @mrFRONT_ Love ya....
@madflavor - @YusefTheG Knock them dead my man....
@madflavor - @kianmakanvand Thank you for the offer my man.....Much love!
@madflavor - Here you go...... https://t.co/L4VT7xDprV
@madflavor - @danyel2092 Whatever kills a motherfucker........I'm not big on names because its bullshit.....
@madflavor - @BrandonBonta @ConanOBrien I'm the original.....since 1966 so it doesnt bother me at all...
```
