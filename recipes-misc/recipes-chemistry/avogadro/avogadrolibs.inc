SUMMARY = "Chemistry library"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis and data processing useful in computational chemistry, molecular modeling, bioinformatics, materials science, and related areas"
HOMEPAGE = "http://openchemistry.org/avogadro2"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95b8695b33e17e83db253ab07da4455a"

inherit cmake_qt5 python3native

PV = "1.92.1"
SRC_URI = "git://github.com/OpenChemistry/avogadrolibs.git"
SRCREV = "fcd8bda27755fd8a817bd58307cc370f3bc0cfdf"
S = "${WORKDIR}/git"
