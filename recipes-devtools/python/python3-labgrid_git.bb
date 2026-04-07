require python3-labgrid.inc

SRC_URI += "git://github.com/labgrid-project/labgrid.git;protocol=https;branch=${SRCBRANCH}"

SRCBRANCH = "master"
SRCREV = "39124867b91f8ffdf594c94959889bfd70ea5413"

PV = "25.0+git"

LABGRID_USE_DEVEL_VERSION[doc] = "Global switch to enable labgrid development (git) version"
LABGRID_USE_DEVEL_VERSION ??= "-1"
DEFAULT_PREFERENCE ??= "${LABGRID_USE_DEVEL_VERSION}"
