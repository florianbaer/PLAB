#
# Just a dummy Makefile, albeit working ;)
#

default:
	@echo 'Creates dot to png'
	@echo 'It could be used as an input file for the makefile2dot visualizer'
	@echo 'Type "make all" to generate example output.png'

ALL := output.dot output.png

all: ggt.png

ggt.png:
	dot -Tpng ggt.dot > ggt.png

clean:
	# //rm -f $(ALL)