# makeJAVAC=Users/saani/Documents/unixTest/Question5/bin/javac
# .SUFFIXES: .java .class

# SRCDIR=src
# BINDIR=bin

# $(BINDIR)/%.class:$(SRCDIR)/%.java
# 	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

# CLASSES= DamArrayApp.class 

# CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

# default: $(CLASS_FILES)

# clean:
# 	rm $(BINDIR)/*.class
# run:
# 	java -cp bin DamArrayApp

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ./gson/gson-2.8.6.jar -sourcepath ./src ./src/$*.java


JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: DamArrayApp.class
default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: DamArrayApp.class
	      
junit: test_classes
	
DamArrayApp.class: DamArrayApp.java
	javac -d $(BINDIR) -cp  $(JUNIT)

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc

