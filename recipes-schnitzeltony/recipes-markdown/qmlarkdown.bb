SUMMARY = "Simple WYSIWYG CommonMark(down) editor "
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=5b4473596678d62d9d83096273422c8c \
"

DEPENDS = " \
    markdown-qt \
    qtdeclarative \
    qtquickcontrols2 \
    qtwebengine \
"

SRC_URI = "gitsm://github.com/schnitzeltony/qmlarkdown.git"
SRCREV = "a869ee768255646b83bf7732c4d63fa1f22da0f6"
PV = "0.0.0+git${SRCPV}"
S = "${WORKDIR}/git"

inherit cmake_qt5